public class ChainingHash {
    public Slot[] hashTable;
    public ChainingHash(Integer size){
        this.hashTable = new Slot[size];
    }

    public class Slot{
        String key;
        String value;
        Slot next;
        Slot(String key, String value){
            this.value = value;
            this.key = key;
            this.next = null;
        }
    }


    public Integer hashFunc(String key){
        return (int)(key.charAt(0))%this.hashTable.length;
    }

    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            //this.hashTable[address].value = value; 여기가 Linked List일 수 있음
            Slot findSlot = this.hashTable[address]; // head 역할
            Slot prevSlot = this.hashTable[address];

            while(findSlot != null){
                if(findSlot.key == key){
                    findSlot.value = value; //update
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value); // Linked List 끝까지 다 돌고 없으니 새로 만들어 추가해준다.
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }



    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            Slot findSlot = this.hashTable[address];
            while( findSlot != null){
                if(findSlot.key == key){
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null;

        } else{
            //앖을 때
            return null;
        }
    }

}
