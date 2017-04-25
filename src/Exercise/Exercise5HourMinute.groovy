package Exercise

class Exercise5HourMinute {
    int hours
    int minute

    Exercise5HourMinute plus(Exercise5HourMinute exercise5HourMinute) {
        new Exercise5HourMinute(hours: hours + exercise5HourMinute.hours, minute: minute + exercise5HourMinute.minute)
    }

    Exercise5HourMinute minus(Exercise5HourMinute exercise5HourMinute) {
        new Exercise5HourMinute(hours: hours - exercise5HourMinute.hours, minute: minute - exercise5HourMinute.minute)
    }

    static void main(String[] args) {
        Exercise5HourMinute exercise5HourMinute1 = new Exercise5HourMinute(hours: 10, minute: 40)
        println exercise5HourMinute1
        Exercise5HourMinute exercise5HourMinute2 = new Exercise5HourMinute(hours: 20, minute: 80)
        println exercise5HourMinute2
        Exercise5HourMinute plus = exercise5HourMinute1 + exercise5HourMinute2;
        Exercise5HourMinute minus = exercise5HourMinute2 - exercise5HourMinute1;

        println "Using + operator overloading $plus"
        println "Using - operator overloading $minus"
    }


    @Override
    public String toString() {
        return """\

    hours=$hours, 
    minute=$minute
"""
    }
}
