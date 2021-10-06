import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;


public class Example {
    public static void main(String[] args) {
        try (CqlSession session = CqlSession.builder().build()) {
            ResultSet rs = session.execute("SELECT * FROM killrvideo.users;");

            for (Row row : rs) {
                System.out.println(row.getUuid("user_id") + " " + row.getString("first_name") + " "
                        + row.getString("last_name"));
            }
        }
    }
}
