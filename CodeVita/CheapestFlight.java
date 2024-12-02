package CodeVita;

import java.util.*;

class Flight {
    String from;
    String to;
    int takeOff;
    int landing;
    int cost;

    public Flight(String from, String to, int takeOff, int landing, int cost) {
        this.from = from;
        this.to = to;
        this.takeOff = takeOff;
        this.landing = landing;
        this.cost = cost;
    }
}

class CityTravel {
    String city;
    int time;
    int cost;

    public CityTravel(String city, int time, int cost) {
        this.city = city;
        this.time = time;
        this.cost = cost;
    }
}

public class CheapestFlight {
    private static int convertToMinutes(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        boolean isPM = time.substring(5).equalsIgnoreCase("Pm");

        if (isPM && hours != 12) hours += 12;
        if (!isPM && hours == 12) hours = 0;

        return hours * 60 + minutes;
    }

    public static int findCheapestPath(String startCity, String endCity, int preferredStart, int preferredEnd, List<Flight> flights) {
        Map<String, List<Flight>> flightMap = new HashMap<>();
        for (Flight flight : flights) {
            flightMap.computeIfAbsent(flight.from.toLowerCase(), k -> new ArrayList<>()).add(flight);
        }

        PriorityQueue<CityTravel> pq = new PriorityQueue<>(Comparator.comparingInt(ct -> ct.cost));
        pq.add(new CityTravel(startCity.toLowerCase(), preferredStart, 0));

        Map<String, Integer> minCostMap = new HashMap<>();
        minCostMap.put(startCity.toLowerCase(), 0);

        while (!pq.isEmpty()) {
            CityTravel current = pq.poll();

            if (current.city.equals(endCity.toLowerCase()) && current.time <= preferredEnd) {
                return current.cost;
            }

            if (current.cost > minCostMap.getOrDefault(current.city, Integer.MAX_VALUE)) {
                continue;
            }

            List<Flight> availableFlights = flightMap.getOrDefault(current.city, new ArrayList<>());
            for (Flight flight : availableFlights) {
                if (flight.takeOff >= current.time && flight.takeOff >= preferredStart && flight.landing <= preferredEnd) {
                    int newCost = current.cost + flight.cost;
                    if (newCost < minCostMap.getOrDefault(flight.to.toLowerCase(), Integer.MAX_VALUE)) {
                        minCostMap.put(flight.to.toLowerCase(), newCost);
                        pq.add(new CityTravel(flight.to.toLowerCase(), flight.landing, newCost));
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Flight> flights = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] flightDetails = scanner.nextLine().split(" ");
            String from = flightDetails[0];
            String to = flightDetails[1];
            int takeOff = convertToMinutes(flightDetails[2]);
            int landing = convertToMinutes(flightDetails[3]);
            int cost = Integer.parseInt(flightDetails[4]);
            flights.add(new Flight(from, to, takeOff, landing, cost));
        }

        String[] travelDetails = scanner.nextLine().split(" ");
        String startCity = travelDetails[0];
        String endCity = travelDetails[1];
        int preferredStart = convertToMinutes(travelDetails[2]);
        int preferredEnd = convertToMinutes(travelDetails[3]);

        int result = findCheapestPath(startCity, endCity, preferredStart, preferredEnd, flights);
        System.out.println(result == -1 ? "Impossible" : result);

        scanner.close();
    }
}
