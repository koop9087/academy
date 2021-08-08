package by.academy.homework5.task1.entity;

import by.academy.homework5.task1.logic.DateService;
import java.text.ParseException;

public class MyDate {
    DateService transformation = new DateService();
    private String ourDate;
    private Day day;
    private Month month;
    private Year year;

    public MyDate() {
        super();
    }

    public MyDate(String ourDate) {
        this.ourDate = ourDate;
        try {
            this.day = new Day(Integer.toString(transformation.getOurDay(ourDate)));
            this.month = new Month(Integer.toString(transformation.getOurMonth(ourDate)));
            this.year = new Year(Integer.toString(transformation.getOurYear(ourDate)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public class Year {
        private String myYear;

        public Year() {
            super();
        }

        public Year(String myYear) {
            this.myYear = myYear;
        }

        public String getMyYear() {
            return myYear;
        }

        public void setMyYear(String myYear) {
            this.myYear = myYear;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Year year1 = (Year) o;
            return myYear != null ? myYear.equals(year1.myYear) : year1.myYear == null;
        }

        @Override
        public int hashCode() {
            return myYear != null ? myYear.hashCode() : 0;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Year{");
            sb.append("year=").append(myYear);
            sb.append('}');
            return sb.toString();
        }
    }

    public class Month {
        private String myMonth;

        public Month() {
            super();
        }

        public Month(String myMonth) {
            this.myMonth = myMonth;
        }

        public String getMyMonth() {
            return myMonth;
        }

        public void setMyMonth(String myMonth) {
            this.myMonth = myMonth;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Month month = (Month) o;
            return myMonth != null ? myMonth.equals(month.myMonth) : month.myMonth == null;
        }

        @Override
        public int hashCode() {
            return myMonth != null ? myMonth.hashCode() : 0;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Month{");
            sb.append("myMonth=").append(myMonth);
            sb.append('}');
            return sb.toString();
        }
    }

    public class Day {
        private String myDay;

        public Day(String myDay) {
            this.myDay = myDay;
        }

        public String getMyDay() {
            return myDay;
        }

        public void setMyDay(String myDay) {
            this.myDay = myDay;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Day day = (Day) o;
            return myDay != null ? myDay.equals(day.myDay) : day.myDay == null;
        }

        @Override
        public int hashCode() {
            return myDay != null ? myDay.hashCode() : 0;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Day{");
            sb.append("myDay='").append(myDay).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public String getOurDate() {
        return ourDate;
    }

    public void setOurDate(String ourDate) {
        this.ourDate = ourDate;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        if (ourDate != null ? !ourDate.equals(myDate.ourDate) : myDate.ourDate != null) return false;
        if (day != null ? !day.equals(myDate.day) : myDate.day != null) return false;
        if (month != null ? !month.equals(myDate.month) : myDate.month != null) return false;
        return year != null ? year.equals(myDate.year) : myDate.year == null;
    }

    @Override
    public int hashCode() {
        int result = ourDate != null ? ourDate.hashCode() : 0;
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyDate{");
        sb.append("ourDate='").append(ourDate).append('\'');
        sb.append(", day=").append(day);
        sb.append(", month=").append(month);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
