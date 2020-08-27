package service;

import java.util.List;
import model.Series;

public interface ServiceSeries {

	public List<Series> getSeries();
	public Series getSeriesByName(String name);
}
