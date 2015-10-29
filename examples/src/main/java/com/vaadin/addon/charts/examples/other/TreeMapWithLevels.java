package com.vaadin.addon.charts.examples.other;

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.examples.AbstractVaadinChartExample;
import com.vaadin.addon.charts.model.ChartType;
import com.vaadin.addon.charts.model.DataLabels;
import com.vaadin.addon.charts.model.HorizontalAlign;
import com.vaadin.addon.charts.model.Levels;
import com.vaadin.addon.charts.model.PlotOptionsTreeMap;
import com.vaadin.addon.charts.model.TreeMapLayoutAlgorithm;
import com.vaadin.addon.charts.model.TreeSeries;
import com.vaadin.addon.charts.model.TreeSeriesItem;
import com.vaadin.addon.charts.model.VerticalAlign;
import com.vaadin.addon.charts.model.style.FontWeight;
import com.vaadin.addon.charts.model.style.SolidColor;
import com.vaadin.addon.charts.model.style.Style;
import com.vaadin.ui.Component;

public class TreeMapWithLevels extends AbstractVaadinChartExample {

    @Override
    public String getDescription() {
        return "Tree map with levels";
    }

    @Override
    protected Component getChart() {
        Chart chart = new Chart(ChartType.TREEMAP);

        PlotOptionsTreeMap plotOptions = new PlotOptionsTreeMap();
        // FIXME remove toString() once enums are used in model (CHARTS-159)
        plotOptions.setLayoutAlgorithm(TreeMapLayoutAlgorithm.STRIPES
                .toString());
        plotOptions.setAlternateStartingDirection(true);

        Levels level1 = new Levels();
        level1.setLevel(1);
        level1.setLayoutAlgorithm(TreeMapLayoutAlgorithm.SLICEANDDICE
                .toString());

        DataLabels dataLabels = new DataLabels();
        dataLabels.setEnabled(true);
        dataLabels.setAlign(HorizontalAlign.LEFT.toString());
        dataLabels.setVerticalAlign(VerticalAlign.TOP.toString());

        Style style = new Style();
        style.setFontSize("15px");
        style.setFontWeight(FontWeight.BOLD);

        dataLabels.setStyle(style);
        level1.setDataLabels(dataLabels);
        plotOptions.setLevels(new Levels[] { level1 });

        TreeSeries series = createSeries();
        series.setPlotOptions(plotOptions);

        chart.getConfiguration().addSeries(series);

        chart.getConfiguration().setTitle("Fruit consumption");

        return chart;
    }

    private TreeSeries createSeries() {
        TreeSeries series = new TreeSeries();

        TreeSeriesItem apples = new TreeSeriesItem("A", "Apples");
        apples.setColor(new SolidColor("#EC2500"));

        TreeSeriesItem bananas = new TreeSeriesItem("B", "Bananas");
        bananas.setColor(new SolidColor("#ECE100"));

        TreeSeriesItem oranges = new TreeSeriesItem("O", "Oranges");
        oranges.setColor(new SolidColor("#EC9800"));

        TreeSeriesItem anneA = new TreeSeriesItem("Anne", apples, 5);
        TreeSeriesItem rickA = new TreeSeriesItem("Rick", apples, 3);
        TreeSeriesItem peterA = new TreeSeriesItem("Peter", apples, 4);

        TreeSeriesItem anneB = new TreeSeriesItem("Anne", bananas, 4);
        TreeSeriesItem rickB = new TreeSeriesItem("Rick", bananas, 10);
        TreeSeriesItem peterB = new TreeSeriesItem("Peter", bananas, 1);

        TreeSeriesItem anneO = new TreeSeriesItem("Anne", oranges, 1);
        TreeSeriesItem rickO = new TreeSeriesItem("Rick", oranges, 3);
        TreeSeriesItem peterO = new TreeSeriesItem("Peter", oranges, 3);

        TreeSeriesItem susanne = new TreeSeriesItem("Susanne", 2);
        susanne.setParent("Kiwi");
        susanne.setColor(new SolidColor("#9EDE00"));

        series.addAll(apples, bananas, oranges, anneA, rickA, peterA, anneB,
                rickB, peterB, anneO, rickO, peterO, susanne);

        return series;
    }
}
