public class main {

    public static void main(String[] args) {

        System.out.println("hello");

        ContactsManager myContactsManager = new ContactsManager();

        Contact Awaash =new Contact();
        Awaash.name="Awaash";
        Awaash.phoneNumber="050555555";
        myContactsManager.addContact(Awaash);

        Contact Roro =new Contact();
        Roro.name="Roro";
        Roro.phoneNumber="050515555";
        myContactsManager.addContact(Roro);

        Contact Asoom =new Contact();
        Asoom.name="Awaash";
        Asoom.phoneNumber="050525555";
        myContactsManager.addContact(Asoom);

        Contact maryam =new Contact();
        maryam.name="maryam";
        maryam.phoneNumber="050535555";
        myContactsManager.addContact(maryam);

        Contact nada =new Contact();
        nada.name="nada";
        nada.phoneNumber="050545555";
        myContactsManager.addContact(nada);




    }
}