package br.com.senior.hcm.pontomobile.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ClockingEventPeriod {

    @NonNull
    private String initialDate;

    @NonNull
    private String finalDate;

    private String initialTime;

    private String finalTime;

}
