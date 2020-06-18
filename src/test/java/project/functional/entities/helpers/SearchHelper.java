package project.functional.entities.helpers;

import project.functional.entities.pages.SearchPage;

public class SearchHelper extends AbstractHelper{
    private SearchPage searchPage = new SearchPage();

    public int getSearchResultsCountPerPage(){
        return searchPage.getResultsPerPage();
    }

    public int getAllResultsCount(){
        return Integer.parseInt(searchPage.getResultsCount().split(" ")[0]);
    }
}
