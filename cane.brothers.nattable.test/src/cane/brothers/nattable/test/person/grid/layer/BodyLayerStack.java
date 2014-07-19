package cane.brothers.nattable.test.person.grid.layer;

import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.hideshow.ColumnHideShowLayer;
import org.eclipse.nebula.widgets.nattable.layer.AbstractLayerTransform;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.reorder.ColumnReorderLayer;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.viewport.ViewportLayer;

public class BodyLayerStack extends AbstractLayerTransform {

	private SelectionLayer selectionLayer;

	public BodyLayerStack(IDataProvider dataProvider) {
		DataLayer bodyDataLayer = new DataLayer(dataProvider);
		ColumnReorderLayer columnReorderLayer = new ColumnReorderLayer(bodyDataLayer);
		ColumnHideShowLayer columnHideShowLayer = new ColumnHideShowLayer(columnReorderLayer);
		selectionLayer = new SelectionLayer(columnHideShowLayer);
		ViewportLayer viewportLayer = new ViewportLayer(selectionLayer);
		setUnderlyingLayer(viewportLayer);
	}

	public SelectionLayer getSelectionLayer() {
		return selectionLayer;
	}
}
