package medve.shop.ordermanager.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 5/16/17.
 */

public class OrderDTO implements Serializable {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("items")
    private Set<ItemDTO> items = new HashSet<>();

    public OrderDTO() {
    }

    public OrderDTO(Long id, Boolean status, Set<ItemDTO> items) {
        this.id = id;
        this.status = status;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Set<ItemDTO> getItems() {
        return items;
    }

    public void setItems(Set<ItemDTO> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", status=" + status +
                ", items=" + items +
                '}';
    }
}
