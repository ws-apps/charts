package com.vaadin.addon.charts.testbenchtests;

import org.junit.Ignore;

import com.vaadin.addon.charts.examples.other.VUMeter;

@Ignore("invalid pane2.setCenterXY API")
public class VUMeterTBTest extends AbstractSimpleScreenShotTestBenchTest {

    @Override
    protected String getTestViewName() {
        return VUMeter.class.getSimpleName();
    }

    @Override
    protected String getPackageName() {
        return "other";
    }

}
