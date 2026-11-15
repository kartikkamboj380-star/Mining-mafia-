package com.bytedance.sdk.component.csi.fou.bob.kq.kq;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nn;
import com.bytedance.sdk.component.utils.rjo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private int kq;
    private File oq;

    private kq(int i10, File file) {
        this.kq = i10;
        this.oq = file;
    }

    private void bob(File file) {
        if (file == null) {
            return;
        }
        try {
            rjo.oq(file);
        } catch (Throwable unused) {
        }
    }

    private static void fou(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static kq kq(int i10, File file) {
        try {
            kq kqVar = new kq(i10, file);
            if (file != null) {
                file.mkdirs();
            }
            return kqVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private List<File> oq(File file) {
        List<File> listKq = kq(file);
        if (listKq == null || listKq.isEmpty()) {
            return null;
        }
        final HashMap map = new HashMap();
        for (File file2 : listKq) {
            map.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(listKq, new Comparator<File>() { // from class: com.bytedance.sdk.component.csi.fou.bob.kq.kq.kq.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public int compare(File file3, File file4) {
                if (file3 == null && file4 == null) {
                    return 0;
                }
                if (file3 == null) {
                    return 1;
                }
                if (file4 == null) {
                    return -1;
                }
                return Long.compare(((Long) map.get(file4)).longValue(), ((Long) map.get(file3)).longValue());
            }
        });
        return listKq;
    }

    private File bob(String str) {
        return new File(this.oq, str + ".temp");
    }

    public synchronized InputStream kq(String str) {
        FileInputStream fileInputStream;
        if (this.kq <= 0) {
            return null;
        }
        File fileOq = oq(str);
        try {
            try {
                fileInputStream = new FileInputStream(fileOq);
                try {
                    bob(fileOq);
                    return fileInputStream;
                } catch (FileNotFoundException unused) {
                    nn.kq(fileInputStream);
                    return null;
                }
            } catch (Throwable unused2) {
                return null;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
        }
    }

    private File oq(String str) {
        return new File(this.oq, str);
    }

    public synchronized boolean kq(String str, byte[] bArr) {
        if (this.kq > 0 && str != null && bArr != null) {
            File fileBob = bob(str);
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileBob);
                try {
                    fileOutputStream2.write(bArr);
                    if (fileBob.exists()) {
                        kq(fileBob, oq(str), true);
                    }
                    nn.kq(fileOutputStream2);
                    List<File> listKq = kq(this.oq);
                    if (listKq != null) {
                        int size = listKq.size();
                        int i10 = this.kq;
                        if (size > i10) {
                            kq((int) (((double) i10) * 0.7d));
                        }
                    }
                    return true;
                } catch (FileNotFoundException unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        File file = this.oq;
                        if (file != null) {
                            file.mkdirs();
                        }
                        nn.kq(fileOutputStream);
                        List<File> listKq2 = kq(this.oq);
                        if (listKq2 != null) {
                            int size2 = listKq2.size();
                            int i11 = this.kq;
                            if (size2 > i11) {
                                kq((int) (((double) i11) * 0.7d));
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        nn.kq(fileOutputStream);
                        List<File> listKq3 = kq(this.oq);
                        if (listKq3 != null) {
                            int size3 = listKq3.size();
                            int i12 = this.kq;
                            if (size3 > i12) {
                                kq((int) (((double) i12) * 0.7d));
                            }
                        }
                        throw th;
                    }
                } catch (Throwable unused2) {
                    fileOutputStream = fileOutputStream2;
                    nn.kq(fileOutputStream);
                    List<File> listKq4 = kq(this.oq);
                    if (listKq4 != null) {
                        int size4 = listKq4.size();
                        int i13 = this.kq;
                        if (size4 > i13) {
                            kq((int) (((double) i13) * 0.7d));
                        }
                    }
                    return false;
                }
            } catch (FileNotFoundException unused3) {
            } catch (Throwable unused4) {
            }
        }
        return false;
    }

    private List<File> kq(File file) {
        File[] fileArrListFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                    List<File> listAsList = Arrays.asList(fileArrListFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listAsList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public synchronized void kq(int i10) {
        try {
            if (i10 > this.kq) {
                return;
            }
            List<File> listOq = oq(this.oq);
            if (listOq != null && listOq.size() > i10) {
                while (i10 < listOq.size()) {
                    File file = listOq.get(i10);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i10++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void kq(File file, File file2, boolean z9) throws IOException {
        if (z9) {
            fou(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
