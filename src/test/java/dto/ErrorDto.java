package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
public class ErrorDto {
    String timestamp;
    int status;
    String error;
    Object message;
    String path;
}
