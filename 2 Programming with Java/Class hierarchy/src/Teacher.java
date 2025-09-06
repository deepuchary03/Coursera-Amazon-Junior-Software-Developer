class Teacher extends Employee {
    String qualification;
    String subject;
    Teacher(String name, Date date1, Date date2, String qual, String subject) {
        this.name = name;
        this.dob = date1;
        this.dateOfAppointment = date2;
        this.subject = subject;
        this.qualification = qual;
    }

    @Override
    void getDetails() {
        System.out.println("Name of Teacher: "+this.name);
        System.out.println("Date of Birth: "+this.dob.getDate());
        System.out.println("Date of Appointment: "+this.dateOfAppointment.getDate());
        System.out.println("Subject: "+this.subject);
        System.out.println("Qualifications: "+this.qualification);
        System.out.println("Salary: "+this.getSalary());

    }
             @Override
    void setSalary(int sal) {
        this.salary = sal;
    }

    @Override
    int getSalary() {
        return this.salary;
    }
}
                                                   

  