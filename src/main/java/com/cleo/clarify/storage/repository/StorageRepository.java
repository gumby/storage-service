package com.cleo.clarify.storage.repository;

import com.cleo.clarify.storage.model.Chunk;
import com.cleo.clarify.storage.model.ObjectMetadata;

import rx.Observable;

public interface StorageRepository {
  
  public Observable<Chunk> readChunk(String objectId, int chunkIndex);

  public Observable<ObjectMetadata> readMetadata(String objectId);
  
  public void writeMetadata(String objectId, int chunkSize, long objectSize);

  public void writeChunk(String id, int chunkIndex, byte[] data);
  
}
