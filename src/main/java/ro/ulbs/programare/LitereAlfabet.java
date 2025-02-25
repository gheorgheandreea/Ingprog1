package ro.ulbs.programare;

public class LitereAlfabet {
    public static void main(String[] args) {
    int n= 'z'-'a';
    char c='a';
    char d='A';
    char alf[]=new char[n];
    char alf1[]=new char[n];
    for(int i=0;i<n;i++){
        alf[i]=c++;
    }
    for(int i=0;i<n;i++){
            alf1[i]=d++;
    }
        for(int i=0;i<n;i++){
            System.out.print(alf[i]+" ");
        }
        System.out.println(" ");
        for(int i=0;i<n;i++){
            System.out.print(alf1[i]+" ");
        }
}}
