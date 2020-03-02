package tutby.utils;

import tutby.components.SearchResult;

import java.util.List;

public class SearchResultValidation {

    public Integer checkResults(List<SearchResult> searchResultList, String searchText) {
        Integer allResults = 0;
        Integer matchingResults = 0;
        for (SearchResult searchResult : searchResultList) {
            if (searchResult.getTitle().contains(searchText)){
                matchingResults ++;
            }
            allResults++;
        }

        if (allResults == 0){
            return 0;
        }
        return matchingResults/allResults;
    }
}
