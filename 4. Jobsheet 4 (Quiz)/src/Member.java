public class Member {
    public String memberName;
    public int age;
    public int workoutHours;
    public double membershipFee;

    public double totalCosts() {
        double totalCost = membershipFee * workoutHours;
        
        if (workoutHours >= 15) {
            double discount = totalCost * 0.10;
            return totalCost - discount;
        }
        return totalCost;
    }
    

    public void printData() {
        System.out.println("Member name: " + memberName);
        System.out.println("Member Age: " + age);
        System.out.println("Workout time (hours): " + workoutHours);
        System.out.println("Fee per hour: Rp. " + membershipFee);
        System.out.println("Total cost: Rp. " + totalCosts());
        if (workoutHours >= 15) {
            double totalCost = membershipFee * workoutHours;
            System.out.println("Total cost before discount: Rp. " + totalCost);
        }
        System.out.println();
    }

    public Member() {

    }

    public Member (String name, int age, int hours, double fee) {
        memberName = name;
        this.age = age;
        workoutHours = hours;
        membershipFee = fee;

    }
}