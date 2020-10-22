package br.com.senior.hcm.pontomobile.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ClockingEventExportByPeriodIn {

    @NonNull
    private String fileType;

    private boolean exportGeolocation;

    @NonNull
    private ClockingEventPeriod period;
}
