package model;

public class Segment {

    private int segmentId;
    private String segmentName;
    private String description;
    private String criteria;

    public Segment() {
    }

    public Segment(int segmentId, String segmentName,
                   String description, String criteria) {

        this.segmentId = segmentId;
        this.segmentName = segmentName;
        this.description = description;
        this.criteria = criteria;
    }

    public int getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(int segmentId) {
        this.segmentId = segmentId;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    @Override
    public String toString() {
        return segmentName;
    }
}