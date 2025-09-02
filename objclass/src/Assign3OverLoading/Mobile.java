package Assign3OverLoading;

class Mobile {
    public void addContact(String name, String phoneNumber) {
        System.out.println("Contact Added: " + name + "  Phone: " + phoneNumber);
    }
    public void addContact(String name, String phoneNumber, String email) {
        System.out.println("Contact Added: " + name + "  Phone: " + phoneNumber + "  Email: " + email);
    }

    public void addContact(String name, String phoneNumber, String email, String address) {
        System.out.println("Contact Added: " + name + " Phone: " + phoneNumber +
                           " Email: " + email + " Address: " + address);
    }

    public void addContact(String[] names, String[] numbers) {
        System.out.println("Bulk Adding Contacts:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Contact Added: " + names[i] + " Phone: " + numbers[i]);
        }
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        mobile.addContact("raghu", "987688543210");
        mobile.addContact("ajay", "91238456789", "aja@example.com");
        mobile.addContact("Arjun", "99888776655", "arjun@example.com", "Bangalore");

        String[] names = {"raghav", "druva", "Suresh"};
        String[] numbers = {"9991112222", "8883334444", "7775556666"};
        mobile.addContact(names, numbers);
    }
}
