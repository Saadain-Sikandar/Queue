public class HospitalQueue {

    Patient queue[];
    int size ;

    HospitalQueue(int capacity){
     queue = new Patient[capacity];
     size = 0;
    }

    boolean isfull(){

        return size == queue.length-1;
    }

    public void AddPatient(Patient patient){

        if(!isfull()){

           queue[size] = patient;
           size++;

           for(int i = 0 ;i < size-1;i++){

               if(queue[i].Severity<queue[i+1].Severity){

                    Patient temp = queue[i];
                    queue[i] = queue[i+1];
                    queue[i+1] = temp;


               }
        }
    }

        else{

            System.out.println("Queue is Full!");

        }

    }

    public void Treatnext(){

        if(size==0){

            System.out.println("No Patient In Waiting.");

        }
        else {

            System.out.println("\n\nTreating Patient:"+queue[0].name);

        }

        for(int i = 0 ; i<size-1 ;i++){

            queue[i] = queue[i+1];

        }
        queue[size-1] = null;
        size--;

    }

    public void DisplayAllPatient(){

        if(size == 0){

            System.out.println("No Patient to display:");
        }

        System.out.println("\nPATIENT LIST.");

        for(int i = 0 ;i<size;i++){

            System.out.println("\n"+i+":"+"Name:"+queue[i].name+"\nSeverity:"+queue[i].Severity+"\nIllness:"+queue[i].illness
             +"\nCondition:" + queue[i].condition  );

        }

    }





}
