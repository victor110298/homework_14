package prototype;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Detail implements Copyable {
    private String size;
    private String color;

    @Override
    public Object copy() {
        Detail copy = new Detail(size, color);
        return copy;
    }
}
