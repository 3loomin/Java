public class MyHash2 {
    public Slot[] hashTable;
    public MyHash2(Integer size){
        this.hashTable = new Slot[size];
    }

    public class Slot{
        String value;
        Slot(String value){
            this.value = value;
        }
    }

// 기존의 Hash Func 자체의 충돌이 빈번하기 때문에 hashFunc를 개선 시키자!
//    public Integer hashFunc(String key){
//        return (int)(key.charAt(0))%this.hashTable.length;
//    }
    public Integer hashFunc(String key){
        int res = 0;
        for (int i = 0; i < key.length(); i++ ){
            res += key.charAt(i);
        }
        // 우선 총 hashfunc가 가질 수 있는 범위를 늘린다. 그리고 해쉬 함수를 재정의한다  20 >> 200
        return (int)(res) % this.hashTable.length;

    }


    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            this.hashTable[address].value = value;

        } else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            return this.hashTable[address].value;
        } else{
            return null;
        }
    }

}
