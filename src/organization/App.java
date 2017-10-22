package organization;

import organization.docs.Doc;
import organization.docs.DocFactory;
import organization.docs.DocGenerator;
import organization.worker.Man;
import organization.worker.Organization;
import organization.worker.Passport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by student on 05.09.2017.
 * Edited by Pelmenulka and pelmailnik on 19.09.20017.
 */
public class App {

    public static void main(String[] args) {
//        App app = new App();
//        app.start();

        Organization organization = Organization.getOrganization();
        ArrayList<Man> employees = new ArrayList<>();
        Passport passport = new Passport();
        Man man = new Man();

        passport.setDate("19.07.1995");
        passport.setSerial(4895);
        passport.setNum(45564489);
        passport.setPlace("УФМС России по Нижегородской области");

        man.setName("Максим ");
        man.setSurname("Максимов ");
        man.setPatr("Максимович");
        man.setPassport(passport);

        employees.add(man);

        Passport passport2 = new Passport();
        Man man2 = new Man();

        passport2.setDate("10.12.1915");
        passport2.setSerial(9595);
        passport2.setNum(456464498);
        passport2.setPlace("УФМС России по Нижегородской области");

        man2.setName("Антонов ");
        man2.setSurname("Антон ");
        man2.setPatr("Антонович");
        man2.setPassport(passport2);

        employees.add(man2);

        organization.setName("ГАЗПРОМ");
        organization.setAddress("Москва 80");
        organization.setEmployees(employees);

        DocFactory df = new DocFactory();

        DocGenerator dg = new DocGenerator();

        dg.setDocGen(df.getDocLK(man, organization));
//        System.out.println(dg.getDocument(man, organization));
        dg.setDocGen(df.getDoc(man, organization));
//        System.out.println(dg.getDocument(man, organization));

        dg.setDocGen(df.getDocLK(man2, organization));
//        System.out.println(dg.getDocument(man2, organization));
        dg.setDocGen(df.getDoc(man2, organization));
//        System.out.println(dg.getDocument(man2, organization));

//        System.out.println("+++++++++++++++++++++++++++++++++");

//        df.ls.showLink();
        Scanner input = new Scanner(System.in);
        df.ls.delLink(input.nextInt()); //удаляет из списка по номеру которырый ему передать
        //System.out.println(organization);           //вывести организацию и её работников
    }

    void start(){
        while (true){
            System.out.println("Выберете действие (нажмите необходимую цифру):");
            System.out.println("1: Добавить запись");
            System.out.println("2: Редактировать запись");
            System.out.println("3: Удалить запись");
            System.out.println("4: Показать список записей");
            System.out.println("5: Выход из программы");
            System.out.print("> ");
            Scanner input = new Scanner(System.in);
            switch (input.nextInt()) {
                case 1:
                    addEntry();
                    break;
                case 2:
                    editEntry();
                    break;
                case 3:
                    removeEntry();
                    break;
                case 4:
                    showEntry();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    //TODO реализовать следующие методы

    private void addEntry(){

    }

    private void editEntry(){

    }

    private void removeEntry() {

    }

    private void showEntry(){

    }
}
