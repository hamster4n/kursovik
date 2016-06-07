package kursovik.utils;

import java.util.*;

/**
 * @author Ihor Solohub.
 */
public class ListFilterCriterions{
    private List<FilterInter> filterCriterions = new ArrayList<>();

    public ListFilterCriterions(){

    }

    public List<FilterInter> add(FilterInter crit){
        this.filterCriterions.add(crit);
        return filterCriterions;
    }

    public List<FilterInter> getFilterCriterions() {
        return filterCriterions;
    }
}
