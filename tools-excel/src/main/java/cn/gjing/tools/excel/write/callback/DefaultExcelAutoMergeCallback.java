package cn.gjing.tools.excel.write.callback;

import java.lang.reflect.Field;

/**
 * Default auto merge callback of export excel
 * @author Gjing
 **/
public final class DefaultExcelAutoMergeCallback implements ExcelAutoMergeCallback<Object> {
    @Override
    public boolean mergeY(Object o, Field field, String key, int colIndex, int index) {
        return true;
    }
}
