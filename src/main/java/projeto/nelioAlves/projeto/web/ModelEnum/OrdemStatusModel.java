package projeto.nelioAlves.projeto.web.ModelEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
public enum OrdemStatusModel {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);


    private Integer code ;

    private OrdemStatusModel(Integer code){
        this.code =code;
    }

    public static OrdemStatusModel valueOf(int code){
        for (OrdemStatusModel value : OrdemStatusModel.values()){
            if (value.getCode() == code){
                return value;


            }
        }
        throw new  IllegalArgumentException("Codigo invalido");
    }

}
