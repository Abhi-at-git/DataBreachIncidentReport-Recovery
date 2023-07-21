import java.util.*;

class DataBreachIncident {
    private String incidentId;
    private String affectedSystem;
    private Date incidentDate;
    private String description;
    
    // Constructor
    public DataBreachIncident(String incidentId, String affectedSystem, Date incidentDate, String description) {
        this.incidentId = incidentId;
        this.affectedSystem = affectedSystem;  
        this.incidentDate = incidentDate;
        this.description = description;
    }
    
    // Getters and setters
    
    public String getIncidentId() {
        return incidentId;
    }
    
    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }
    
    public String getAffectedSystem() {
        return affectedSystem;
    }
    
    public void setAffectedSystem(String affectedSystem) {
        this.affectedSystem = affectedSystem;
    }
    public Date getIncidentDate() {
        return incidentDate;
    }
    
    public void setIncidentDate(Date incidentDate) {
        this.incidentDate = incidentDate;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    // Method to display incident details
    public void displayDetails() {
        System.out.println("Incident ID: " + incidentId);
        System.out.println("Affected System: " + affectedSystem);
        System.out.println("Incident Date: " + incidentDate);
        System.out.println("Description: " + description);
        System.out.println("--------------------");
    }
}


class DataBreachDetector {
    private Map<String, Integer> accessAttempts; // Map to track access attempts for each user
    
    public DataBreachDetector() {
        accessAttempts = new HashMap<>();
    }
    
    public void recordAccessAttempt(String username) {
        if (accessAttempts.containsKey(username)) {
            int attempts = accessAttempts.get(username);
            accessAttempts.put(username, attempts + 1);
        } else {
            accessAttempts.put(username, 1);
        }
        
        // Check if the access attempts exceed the threshold
        if (accessAttempts.get(username) > 10) {
            System.out.println("Potential data breach detected for user: " + username);
            // Trigger further actions such as logging the incident, notifying incident response team, etc.
        }
    }
}

class DataBreachInc1identReportAndRecovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("[+] Press 1 to run detection.\n[+] Press 2 to generate report.\n[+]Press 0 to quit");
            int operation = sc.nextInt();
            if(operation == 1){
                DataBreachDetector detector = new DataBreachDetector();
                // Simulating access attempts
                detector.recordAccessAttempt("user1");
                detector.recordAccessAttempt("user2");
                detector.recordAccessAttempt("user1");
                detector.recordAccessAttempt("user3");
                detector.recordAccessAttempt("user1");
                detector.recordAccessAttempt("user2");
                detector.recordAccessAttempt("user1");
                detector.recordAccessAttempt("user1");
                detector.recordAccessAttempt("user2");
                detector.recordAccessAttempt("user1");
                detector.recordAccessAttempt("user1"); // Potential breach detected
                
                // Additional access attempts
                detector.recordAccessAttempt("user2");
                detector.recordAccessAttempt("user3");
            }
            else if(operation == 2){
                DataBreachIncident incident1 = new DataBreachIncident("INC001", "Database", new Date(), "Unauthorized access");
                incident1.displayDetails();
            }
            else if(operation == 0){
                System.out.println("[+] Exiting Program");
                flag = false;
            }
        }       
    }    
}