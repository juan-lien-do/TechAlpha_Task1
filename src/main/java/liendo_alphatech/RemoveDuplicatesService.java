package liendo_alphatech;

import lombok.NoArgsConstructor;

import java.util.HashMap;

@NoArgsConstructor
public class RemoveDuplicatesService {

    public Long[] removeDuplicates(Long[] initialNumberArray) {
        int initialLength = initialNumberArray.length;
        //Empty hashmap
        HashMap<Long, Boolean> hashMap = new HashMap<>();

        //This algorithm will ask each element of the array if they are present in the hashMap.
        //If they are not included in the hashmap, they will be added.
        //Otherwise, they won't.
        for (int i = 0; i < initialLength; i++) {
            if (hashMap.get(initialNumberArray[i]) == null) {
                hashMap.put(initialNumberArray[i], true);
            }
        }
        //This returns the numbers in the hashmap as an array.
        return hashMap.keySet().toArray(new Long[0]);

    }
}
