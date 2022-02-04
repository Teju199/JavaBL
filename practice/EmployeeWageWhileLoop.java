package practice;

public class EmployeeWageWhileLoop {
        public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
        public static final int MAX_NUM_OF_WORKING_DAYS = 20;
        public static final int MAX_WORKING_HOURS = 100;

        public static void main(String[] args) {

            int empHours = 0;
            int totalEmpWage = 0;
            int day = 0;
            int totalEmpHours = 0;


            while (day <= MAX_NUM_OF_WORKING_DAYS && totalEmpHours < MAX_WORKING_HOURS) {

                int empCheck = (int) Math.floor(Math.random() * 10) % 3;

                switch (empCheck) {
                    case IS_FULL_TIME:
                        empHours = 8;
                        break;

                    case IS_PART_TIME:
                        empHours = 4;
                        break;
                }

                totalEmpHours = totalEmpHours + empHours;
                int empWage = empHours * EMP_RATE_PER_HOUR;
                totalEmpWage = totalEmpWage + empWage;

                day++;

            }

            System.out.println("Total Employee wage is " + totalEmpWage);

        }
}
