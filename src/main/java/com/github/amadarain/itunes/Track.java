package com.github.amadarain.itunes;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@Builder
public class Track {
    private final int trackId;
    private final String persistentId;
    private final int size;
    private final int totalTime;
    private final int discNumber;
    private final int discCount;
    private final int trackNumber;
    private final int bitRate;
    private final int sampleRate;
    //private final String trackType;
    private final String name;
    private final String artist;
    private final String albumArtist;
    private final String composer;
    private final String album;
    //private final String kind;
    private final String location;

    public int getTrackId() { return trackId; }
    public String getPersistentId() { return persistentId; }
    public int getSize() { return size; }
    public int getTotalTime() { return totalTime; }
    public int getDiscNumber() { return discNumber; }
    public int getDiscCount() { return discCount; }
    public int getTrackNumber() { return trackNumber; }
    public int getBitRate() { return bitRate; }
    public int getSampleRate() { return sampleRate; }
    //public String getTrackType() { return trackType; }
    public String getName() { return name; }
    public String getArtist() { return artist; }
    public String getAlbumArtist() { return albumArtist; }
    public String getComposer() { return composer; }
    public String getAlbum() { return album; }
    //public String getKind() { return kind; }
    public String getLocation() { return location; }
}

