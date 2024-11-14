package com.xworkz.dto;
import lombok.*;

@AllArgsConstructor
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Getter
@ToString
public class CartoonDto {

        private int id;
        private String cartoonName;
        private String category;
        private String creator;
        private int yearStarted;
        private int episodes;
        private String mainCharacter;
        private String voiceActor;
        private String genre;
        private boolean isOngoing;

}



