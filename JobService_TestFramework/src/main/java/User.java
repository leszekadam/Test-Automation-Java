public class User {
    private String jobTitleOne;
    private String jobTitleTwo;
    private String jobLocationOne;
    private String jobLocationTwo;

    public String getJobTitleOne() {
        return jobTitleOne;
    }

    public String getJobTitleTwo() {
        return jobTitleTwo;
    }

    public String getJobLocationOne() {
        return jobLocationOne;
    }

    public String getJobLocationTwo() {
        return jobLocationTwo;
    }

    public User() {
        jobTitleOne = "Tester Oprogramowania"; // 2
        jobTitleTwo = "Test Automation"; // 3
        jobLocationOne = "Wrocław";
        jobLocationTwo = "Opole";
    }
}
