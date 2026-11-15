package com.tenjin.android.store;

import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface QueueEventDao {
    void delete(QueueEvent queueEvent);

    void deleteAllEvents();

    void deleteOldEvents(Date date);

    List<QueueEvent> getAllEvents(Date date);

    List<QueueEvent> getEventsFromParams(String str);

    long insert(QueueEvent queueEvent);
}
