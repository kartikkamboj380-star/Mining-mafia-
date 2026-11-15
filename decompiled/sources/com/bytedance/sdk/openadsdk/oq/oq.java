package com.bytedance.sdk.openadsdk.oq;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class oq extends kq {
    private int bob;
    private volatile boolean fou;
    private int oq;

    public oq(int i10, int i11) {
        this.oq = 15;
        this.bob = 3;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.oq = i10;
        this.bob = i11;
    }

    private void bob(List<File> list) {
        long jOq = oq(list);
        int size = list.size();
        if (kq(jOq, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jOq -= length;
            }
            if (kq(file, jOq, size)) {
                return;
            }
        }
    }

    private void fou(List<File> list) {
        long jOq;
        int size;
        boolean zKq;
        if (list != null) {
            try {
                if (list.size() != 0 && !(zKq = kq((jOq = oq(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !zKq) {
                            ((Long) entry.getKey()).getClass();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                jOq -= length;
                            }
                            if (kq(file2, jOq, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oq.kq
    protected boolean kq(long j10, int i10) {
        return i10 <= this.oq;
    }

    @Override // com.bytedance.sdk.openadsdk.oq.kq
    protected boolean kq(File file, long j10, int i10) {
        return i10 <= this.bob;
    }

    @Override // com.bytedance.sdk.openadsdk.oq.kq
    protected void kq(List<File> list) {
        if (this.fou) {
            fou(list);
            this.fou = false;
        } else {
            bob(list);
        }
    }

    public oq(int i10, int i11, boolean z9) {
        this.oq = 15;
        this.bob = 3;
        if (i10 > 0) {
            this.oq = i10;
            this.bob = i11;
            this.fou = z9;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
