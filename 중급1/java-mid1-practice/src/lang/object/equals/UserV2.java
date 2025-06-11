package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }
/*
    @Override
    public boolean equals(Object obj) {
        UserV2 userId = (UserV2) obj;
        return this.id.equals(userId.id); //id는 String >> String과의 비교는 ==이 아니라 eqquals를 써야 한다.
    }*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }


}

