package com.cv.document;

import java.util.List;

/**
 * Created by alexander.kryvenko on 15.08.2017.
 */
public class DocumentService {

    private Document doc = new Document();

    public void add(Integer item) {
        if (item > 0) {
            this.doc.addNode(item);
        }

        if (item < 0)
            doc.closeNode(item);
    }

    public int getCount() {
        int result = 0;

        for (Node el : getNodes()) {
            int length = el.getBalancedBranchLength();
            if (length > result)
                result = length;
        }

        return result;
    }

    public List<Node> getNodes() {
        return doc.getNodes();
    }

}
