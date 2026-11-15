package com.tenjin.android.store;

import android.content.Context;
import androidx.room.t;
import androidx.room.u;
import com.tenjin.android.config.TenjinConsts;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QueueEventDatabase extends u {
    private static volatile QueueEventDatabase INSTANCE;

    public static QueueEventDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (QueueEventDatabase.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = (QueueEventDatabase) t.a(context.getApplicationContext(), QueueEventDatabase.class, TenjinConsts.QUEUE_EVENT_DATABASE).d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return INSTANCE;
    }

    public abstract QueueEventDao queueEventDao();
}
