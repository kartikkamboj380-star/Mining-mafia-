package p241y0;

import A0.g;
import android.database.Cursor;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import p229w8.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    private static final Map a(g gVar, String str) {
        Cursor cursorK0 = gVar.K0("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorK0.getColumnCount() <= 0) {
                Map mapG = E.g();
                c.a(cursorK0, null);
                return mapG;
            }
            int columnIndex = cursorK0.getColumnIndex(MediationMetaData.KEY_NAME);
            int columnIndex2 = cursorK0.getColumnIndex(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            int columnIndex3 = cursorK0.getColumnIndex("notnull");
            int columnIndex4 = cursorK0.getColumnIndex("pk");
            int columnIndex5 = cursorK0.getColumnIndex("dflt_value");
            Map mapC = E.c();
            while (cursorK0.moveToNext()) {
                String name = cursorK0.getString(columnIndex);
                String type = cursorK0.getString(columnIndex2);
                boolean z9 = cursorK0.getInt(columnIndex3) != 0;
                int i10 = cursorK0.getInt(columnIndex4);
                String string = cursorK0.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(type, "type");
                mapC.put(name, new e.a(name, type, z9, i10, string, 2));
            }
            Map mapB = E.b(mapC);
            c.a(cursorK0, null);
            return mapB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(cursorK0, th);
                throw th2;
            }
        }
    }

    private static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listC = CollectionsKt.c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            listC.add(new e.d(i10, i11, string, string2));
        }
        return CollectionsKt.q0(CollectionsKt.a(listC));
    }

    private static final Set c(g gVar, String str) {
        Cursor cursorK0 = gVar.K0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorK0.getColumnIndex("id");
            int columnIndex2 = cursorK0.getColumnIndex("seq");
            int columnIndex3 = cursorK0.getColumnIndex("table");
            int columnIndex4 = cursorK0.getColumnIndex("on_delete");
            int columnIndex5 = cursorK0.getColumnIndex("on_update");
            List listB = b(cursorK0);
            cursorK0.moveToPosition(-1);
            Set setB = M.b();
            while (cursorK0.moveToNext()) {
                if (cursorK0.getInt(columnIndex2) == 0) {
                    int i10 = cursorK0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : listB) {
                        if (((e.d) obj).e() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        e.d dVar = (e.d) obj2;
                        arrayList.add(dVar.d());
                        arrayList2.add(dVar.f());
                    }
                    String string = cursorK0.getString(columnIndex3);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorK0.getString(columnIndex4);
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorK0.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    setB.add(new e.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set setA = M.a(setB);
            c.a(cursorK0, null);
            return setA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(cursorK0, th);
                throw th2;
            }
        }
    }

    private static final e.C0559e d(g gVar, String str, boolean z9) {
        Cursor cursorK0 = gVar.K0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorK0.getColumnIndex("seqno");
            int columnIndex2 = cursorK0.getColumnIndex("cid");
            int columnIndex3 = cursorK0.getColumnIndex(MediationMetaData.KEY_NAME);
            int columnIndex4 = cursorK0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorK0.moveToNext()) {
                    if (cursorK0.getInt(columnIndex2) >= 0) {
                        int i10 = cursorK0.getInt(columnIndex);
                        String columnName = cursorK0.getString(columnIndex3);
                        String str2 = cursorK0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i10);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "columnsMap.values");
                List listW0 = CollectionsKt.w0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "ordersMap.values");
                e.C0559e c0559e = new e.C0559e(str, z9, listW0, CollectionsKt.w0(collectionValues2));
                c.a(cursorK0, null);
                return c0559e;
            }
            c.a(cursorK0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(cursorK0, th);
                throw th2;
            }
        }
    }

    private static final Set e(g gVar, String str) {
        Cursor cursorK0 = gVar.K0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorK0.getColumnIndex(MediationMetaData.KEY_NAME);
            int columnIndex2 = cursorK0.getColumnIndex("origin");
            int columnIndex3 = cursorK0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setB = M.b();
                while (cursorK0.moveToNext()) {
                    if (Intrinsics.b("c", cursorK0.getString(columnIndex2))) {
                        String name = cursorK0.getString(columnIndex);
                        boolean z9 = true;
                        if (cursorK0.getInt(columnIndex3) != 1) {
                            z9 = false;
                        }
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        e.C0559e c0559eD = d(gVar, name, z9);
                        if (c0559eD == null) {
                            c.a(cursorK0, null);
                            return null;
                        }
                        setB.add(c0559eD);
                    }
                }
                Set setA = M.a(setB);
                c.a(cursorK0, null);
                return setA;
            }
            c.a(cursorK0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(cursorK0, th);
                throw th2;
            }
        }
    }

    public static final e f(g database, String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new e(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}
