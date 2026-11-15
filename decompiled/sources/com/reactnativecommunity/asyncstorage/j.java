package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes3.dex */
public class j extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static j f42078d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f42079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SQLiteDatabase f42080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42081c;

    private j(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f42081c = i.f42077a.longValue() * 1048576;
        this.f42079a = context;
    }

    private synchronized boolean h() {
        c();
        return this.f42079a.deleteDatabase("RKStorage");
    }

    public static j v(Context context) {
        if (f42078d == null) {
            f42078d = new j(context.getApplicationContext());
        }
        return f42078d;
    }

    synchronized void a() {
        n().delete("catalystLocalStorage", null, null);
    }

    public synchronized void c() {
        SQLiteDatabase sQLiteDatabase = this.f42080b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f42080b.close();
            this.f42080b = null;
        }
    }

    synchronized boolean j() {
        SQLiteDatabase sQLiteDatabase = this.f42080b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        SQLiteException e10 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 > 0) {
                try {
                    h();
                } catch (SQLiteException e11) {
                    e10 = e11;
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            this.f42080b = getWritableDatabase();
        }
        SQLiteDatabase sQLiteDatabase2 = this.f42080b;
        if (sQLiteDatabase2 == null) {
            throw e10;
        }
        sQLiteDatabase2.setMaximumSize(this.f42081c);
        return true;
    }

    public synchronized SQLiteDatabase n() {
        j();
        return this.f42080b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 != i11) {
            h();
            onCreate(sQLiteDatabase);
        }
    }
}
