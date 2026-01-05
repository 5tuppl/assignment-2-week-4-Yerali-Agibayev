class as21task3 {
    public static void main(String[] args) {
        String firstName = "Olga"; 
        String lastName = "Kipriyanovna";
        String favoriteDish = "Dumplings";
        printPersonInfo(firstName, lastName, favoriteDish);
}
public static void printPersonInfo(String name, String surname, String meal)
{
    this.firstName=name;
    this.surname=lastName;
    this.meal=favoriteDish;
    

    System.out.println("Brief Dossier:");
    System.out.println("Name: " + firstName);
    System.out.println("LastName: " + lastName);
    System.out.println("Favorite dish: " + favoriteDish);
}
}
