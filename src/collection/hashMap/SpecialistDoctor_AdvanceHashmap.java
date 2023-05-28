package collection.hashMap;

import model.Specialist_Doctors;

import java.util.ArrayList;
import java.util.HashMap;

public class SpecialistDoctor_AdvanceHashmap {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Specialist_Doctors>> doctorList=new HashMap<>();

        //need to create data for multiple specialisations
        ArrayList<Specialist_Doctors> cardiologist_specialist=new ArrayList<>();
        ArrayList<Specialist_Doctors> neurologist_specialist=new ArrayList<>();
        ArrayList<Specialist_Doctors> dentists_specialist=new ArrayList<>();

        Specialist_Doctors doc1= new Specialist_Doctors(1421,"ROHAN","CARDIOLOGIST",120000);
        Specialist_Doctors doc2= new Specialist_Doctors(1422,"AMIT","CARDIOLOGIST",160000);
        Specialist_Doctors doc3= new Specialist_Doctors(1423,"KARAN","CARDIOLOGIST",100000);
        Specialist_Doctors doc4= new Specialist_Doctors(1424,"SIMRAN","CARDIOLOGIST",90000);
        Specialist_Doctors doc5= new Specialist_Doctors(1425,"NANDINI","CARDIOLOGIST",80000);
        Specialist_Doctors doc6= new Specialist_Doctors(1426,"NEEV","CARDIOLOGIST",50000);
        Specialist_Doctors doc7= new Specialist_Doctors(1427,"RISHIT","CARDIOLOGIST",23000);
        Specialist_Doctors doc8= new Specialist_Doctors(1428,"AJEET","CARDIOLOGIST",66000);
        Specialist_Doctors doc9= new Specialist_Doctors(1429,"ANUPAM","CARDIOLOGIST",98000);
        Specialist_Doctors doc10= new Specialist_Doctors(1430,"SWATI","CARDIOLOGIST",120000);

        Specialist_Doctors doc11= new Specialist_Doctors(1431,"ROHAN","NEUROLOGIST",110000);
        Specialist_Doctors doc12= new Specialist_Doctors(1432,"SWATI","NEUROLOGIST",150000);
        Specialist_Doctors doc13= new Specialist_Doctors(1433,"AMIT","NEUROLOGIST",60000);
        Specialist_Doctors doc14= new Specialist_Doctors(1434,"SAGAR","NEUROLOGIST",70000);
        Specialist_Doctors doc15= new Specialist_Doctors(1435,"VINAY","NEUROLOGIST",180000);
        Specialist_Doctors doc16= new Specialist_Doctors(1436,"AMAN","NEUROLOGIST",127000);
        Specialist_Doctors doc17= new Specialist_Doctors(1437,"SIDDHARTH","NEUROLOGIST",145000);
        Specialist_Doctors doc18= new Specialist_Doctors(1438,"ROHIT","NEUROLOGIST",90000);
        Specialist_Doctors doc19= new Specialist_Doctors(1439,"SHUBHAM","NEUROLOGIST",65000);
        Specialist_Doctors doc20= new Specialist_Doctors(1440,"SOHAN","NEUROLOGIST",78000);

        Specialist_Doctors doc21= new Specialist_Doctors(1441,"ROHAN","DENTIST",120000);
        Specialist_Doctors doc22= new Specialist_Doctors(1442,"AMIT","DENTIST",160000);
        Specialist_Doctors doc23= new Specialist_Doctors(1443,"KARAN","DENTIST",100000);
        Specialist_Doctors doc24= new Specialist_Doctors(1444,"SIMRAN","DENTIST",90000);
        Specialist_Doctors doc25= new Specialist_Doctors(1445,"NANDINI","DENTIST",80000);
        Specialist_Doctors doc26= new Specialist_Doctors(1446,"NEEV","DENTIST",50000);
        Specialist_Doctors doc27= new Specialist_Doctors(1447,"RISHIT","DENTIST",23000);
        Specialist_Doctors doc28= new Specialist_Doctors(1448,"AJEET","DENTIST",66000);
        Specialist_Doctors doc29= new Specialist_Doctors(1449,"ANUPAM","DENTIST",98000);
        Specialist_Doctors doc30= new Specialist_Doctors(1450,"SWATI","DENTIST",120000);

        //adding data into arraylist
        cardiologist_specialist.add(doc1);
        cardiologist_specialist.add(doc2);
        cardiologist_specialist.add(doc3);
        cardiologist_specialist.add(doc4);
        cardiologist_specialist.add(doc5);
        cardiologist_specialist.add(doc6);
        cardiologist_specialist.add(doc7);
        cardiologist_specialist.add(doc8);
        cardiologist_specialist.add(doc9);
        cardiologist_specialist.add(doc10);

        neurologist_specialist.add(doc11);
        neurologist_specialist.add(doc12);
        neurologist_specialist.add(doc13);
        neurologist_specialist.add(doc14);
        neurologist_specialist.add(doc15);
        neurologist_specialist.add(doc16);
        neurologist_specialist.add(doc17);
        neurologist_specialist.add(doc18);
        neurologist_specialist.add(doc19);
        neurologist_specialist.add(doc20);

        dentists_specialist.add(doc21);
        dentists_specialist.add(doc22);
        dentists_specialist.add(doc23);
        dentists_specialist.add(doc24);
        dentists_specialist.add(doc25);
        dentists_specialist.add(doc26);
        dentists_specialist.add(doc27);
        dentists_specialist.add(doc28);
        dentists_specialist.add(doc29);
        dentists_specialist.add(doc30);

        // data into hashmap
        doctorList.put("CARDIOLOGIST",cardiologist_specialist);
        doctorList.put("NEUROLOGIST",neurologist_specialist);
        doctorList.put("DENTIST",dentists_specialist);

        for( String var: doctorList.keySet()){
            if(var.equals("NEUROLOGIST")){
                for(Specialist_Doctors neuro_doc: neurologist_specialist){
                    if(neuro_doc.getSalary()>=100000){
                        System.out.println("\nNEUROLOGIST SPECIALIST"+"\nID : "+neuro_doc.getId()+"\nNAME: "+neuro_doc.getName()+"\nSPECIALITY : "+neuro_doc.getSpecialist()+"\nSALARY : "+neuro_doc.getSalary());
                    }
                }
            }
        }

        for( String var: doctorList.keySet()){
            if(var.equals("CARDIOLOGIST")){
                for(Specialist_Doctors cardio_doc: cardiologist_specialist){
                    if(cardio_doc.getSalary()>=100000){
                        System.out.println("\nCARDIOLOGIST SPECIALIST"+"\nID : "+cardio_doc.getId()+"\nNAME: "+cardio_doc.getName()+"\nSPECIALITY : "+cardio_doc.getSpecialist()+"\nSALARY : "+cardio_doc.getSalary());
                    }
                }
            }
        }


    }
}
