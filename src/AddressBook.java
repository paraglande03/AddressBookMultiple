import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static ArrayList<ContactPerson> people =new ArrayList<>();
    static Scanner scan =new Scanner(System.in);
    static final int ZERO = 0, ONE = 1, TWO = 2;


    public static void main(String[] args) {
        int choice=0;
        System.out.println("Welcome to Address book");
        while (choice<6){
            System.out.println("Enter your choice");
            System.out.println("1:Add contact \n2:Print Contact\n3: Edit contact\n4: delete contact\n5:Sort by first name\n6:Sort by city");
            choice=scan.nextInt();
            switch (choice){
                case 1:
                    addPerson();
                    break;
                case 2:
                    printContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    sortByName();
                    break;
                case 6:
                   sortByCity();
                   break;
            }
        }





    }
    public static void addPerson(){

        System.out.println("Enter First Name: ");
        String fname1=scan.next();
        if(checkIfExist(fname1)){
            System.out.println("contact already is there");

        }
        else {
            System.out.println("Enter First Name: ");
            String fname=scan.next();
            System.out.println("Enter Last Name: ");
            String lname = scan.next();
            System.out.println("Enter Address: ");
            String address = scan.next();
            System.out.println("Enter City: ");
            String city = scan.next();
            System.out.println("Enter State: ");
            String state = scan.next();
            System.out.println("Enter Pin Code");
            long zip = scan.nextLong();
            System.out.println("Enter Phone Number");
            long phonenumber = scan.nextLong();

            ContactPerson person1 = new ContactPerson(fname, lname, address, city, state, zip, phonenumber);
            people.add(person1);
        }


    }
    public static void printContact() {
        for (ContactPerson contact : people) {
            System.out.println("Printing contact...");
            System.out.println(contact);

        }
    }
//
    public static void editContact(){
        String fname,lname,city,state,address;
        long zip,phone;
        int id;
        int count;

        for (ContactPerson contact:people){
            System.out.println("ID: #"+people.indexOf(contact)+":"+contact);
        }
        System.out.println("Enter ID of cantact to edit");
        id=scan.nextInt();
        System.out.println(people.get(id));
        System.out.println("what do u want to edit..\n\t 1.Address\t2.Phone number");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter Address");
                address=scan.next();
                people.get(id).setAddress(address);
                System.out.println("enter city");
                city=scan.next();
                people.get(id).setCity(city);
                System.out.println("Enter State");
                state = scan.next();
                people.get(id).setState(state);
                System.out.println("Enter Zip");
                zip = scan.nextLong();
                people.get(id).setZip(zip);
                break;
            case 2:
                System.out.println("Enter Mobile number");
                phone = scan.nextLong();
                people.get(id).setPhonenumber(phone);
                break;
            default:
                System.out.println("plz enter valid option");
                editContact();
        }
    }

    public static void deleteContact(){
        if(people.isEmpty()){
            System.out.println("there is nothing to delete");

        }
        else {
            System.out.println("Enter first name to remove contact");
            String fname=scan.next();
            for(int count=0;count<=people.size();count++){
                if(people.get(count).getfname().equals(fname)){
                    people.remove(people.get(count));
                }
            }
        }
    }

    public static boolean checkIfExist(String name){
        int flag=0;
        boolean res;
        for(ContactPerson person: people){
            if(person.getfname().equals(name)){
                flag=1;
                break;
            }
        }
            if(flag==1){
                 res=true;
            }
            else {
                 res = false;
            }
            return res;

    }
    public static void sortByName() {
        String tmpfname, tmplname, tmpaddr, tmpcity, tmpstate;
        long tmpzip, tmpmobNo;
        for (int count1 = ZERO; count1 < people.size() - 1; count1++) {
            for (int count2 = count1 + 1; count2 < people.size(); count2++) {
                if (people.get(count1).getfname().compareTo(people.get(count2).getfname()) > 0) {
                    tmpfname = people.get(count2).getfname();
                    people.get(count2).setfname(people.get(count1).getfname());
                    people.get(count1).setfname(tmpfname);
                    tmplname = people.get(count2).getlname();
                    people.get(count2).setlname(people.get(count1).getlname());
                    people.get(count1).setlname(tmplname);
                    tmpaddr = people.get(count2).getAddress();
                    people.get(count2).setAddress(people.get(count1).getAddress());
                    people.get(count1).setAddress(tmpaddr);
                    tmpcity = people.get(count2).getCity();
                    people.get(count2).setCity(people.get(count1).getCity());
                    people.get(count1).setCity(tmpcity);
                    tmpstate = people.get(count2).getState();
                    people.get(count2).setState(people.get(count1).getState());
                    people.get(count1).setState(tmpstate);
                    tmpzip = people.get(count2).getZip();
                    people.get(count2).setZip(people.get(count1).getZip());
                    people.get(count1).setZip(tmpzip);
                    tmpmobNo = people.get(count2).getPhonenumber();
                    people.get(count2).setPhonenumber(people.get(count1).getPhonenumber());
                    people.get(count1).setPhonenumber(tmpmobNo);
                }
            }
        }
    }
    public static void sortByCity() {
        String tmpfname, tmplname, tmpaddr, tmpcity, tmpstate;
        long tmpzip, tmpmobNo;
        for (int count1 = ZERO; count1 < people.size() - 1; count1++) {
            for (int count2 = count1 + 1; count2 < people.size(); count2++) {
                if (people.get(count1).getCity().compareTo(people.get(count2).getCity()) > 0) {
                    tmpfname = people.get(count2).getfname();
                    people.get(count2).setfname(people.get(count1).getfname());
                    people.get(count1).setfname(tmpfname);
                    tmplname = people.get(count2).getlname();
                    people.get(count2).setlname(people.get(count1).getlname());
                    people.get(count1).setlname(tmplname);
                    tmpaddr = people.get(count2).getAddress();
                    people.get(count2).setAddress(people.get(count1).getAddress());
                    people.get(count1).setAddress(tmpaddr);
                    tmpcity = people.get(count2).getCity();
                    people.get(count2).setCity(people.get(count1).getCity());
                    people.get(count1).setCity(tmpcity);
                    tmpstate = people.get(count2).getState();
                    people.get(count2).setState(people.get(count1).getState());
                    people.get(count1).setState(tmpstate);
                    tmpzip = people.get(count2).getZip();
                    people.get(count2).setZip(people.get(count1).getZip());
                    people.get(count1).setZip(tmpzip);
                    tmpmobNo = people.get(count2).getPhonenumber();
                    people.get(count2).setPhonenumber(people.get(count1).getPhonenumber());
                    people.get(count1).setPhonenumber(tmpmobNo);
                }
            }
        }
    }



}
