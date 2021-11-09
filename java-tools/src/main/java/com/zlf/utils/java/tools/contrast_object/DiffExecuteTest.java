package com.zlf.utils.java.tools.contrast_object;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiffExecuteTest {

    public static void main(String[] args) {
        diffOneObject();
    }

    public static void diffOneObject() {
        List<NcDiffRecord> result = new ArrayList<>();

        User user1 = User.builder()
                .userId(1)
                .name("name1")
                .addressList(Arrays.asList(Address.builder()
                        .addressId(11)
                        .urlList(Arrays.asList("url111", "url112"))
                        .build()))
                .build();

        User user2 = User.builder()
                .userId(2)
                .name("name1")
                .addressList(Arrays.asList(Address.builder()
                        .addressId(12)
                        .urlList(Arrays.asList("url111", "url112", "url1122"))
                        .build()))
                .build();
        DiffExecute.diffObject("", user1, user2, result);
        System.out.println(result);

    }

}
@Data
@Builder
class User{
    private int userId;
    private String name;

    private List<Address> addressList;
}
@Data
@Builder
class Address{
    private int addressId;
    private List<String> urlList;
}