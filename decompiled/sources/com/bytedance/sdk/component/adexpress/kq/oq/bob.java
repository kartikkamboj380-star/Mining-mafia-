package com.bytedance.sdk.component.adexpress.kq.oq;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.utils.zfx;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class bob {
    public void bob(List<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(kq(), com.bytedance.sdk.component.utils.csi.kq(it.next().kq()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public abstract File kq();

    protected boolean kq(Map<String, com.bytedance.sdk.component.adexpress.kq.bob.kq> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar = map.get(it.next());
            if (kqVar != null && !kq(kqVar.rhi())) {
                return false;
            }
        }
        return true;
    }

    public List<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> oq(com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar, com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (kqVar2 == null || kqVar2.rhi().isEmpty()) {
            arrayList2.addAll(kqVar.rhi());
        } else if (kqVar.rhi().isEmpty()) {
            arrayList.addAll(kqVar2.rhi());
        } else {
            for (com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq c0238kq : kqVar.rhi()) {
                if (!kqVar2.rhi().contains(c0238kq) && c0238kq != null && c0238kq.kq() != null && c0238kq.oq() != null) {
                    arrayList2.add(c0238kq);
                }
            }
            for (com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq c0238kq2 : kqVar2.rhi()) {
                if (!kqVar.rhi().contains(c0238kq2)) {
                    arrayList.add(c0238kq2);
                }
            }
        }
        if (kq(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    protected boolean kq(List<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> list) {
        if (list == null || list.size() <= 0 || kq() == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq c0238kq : list) {
            String strKq = com.bytedance.sdk.component.utils.csi.kq(c0238kq.kq());
            if (TextUtils.isEmpty(strKq)) {
                return false;
            }
            File file = new File(kq(), strKq);
            String strKq2 = com.bytedance.sdk.component.utils.csi.kq(file);
            if (!file.exists() || !file.isFile() || c0238kq.oq() == null || !c0238kq.oq().equals(strKq2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean bob(com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar, com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar2) {
        if (kqVar != null) {
            try {
                if (!TextUtils.isEmpty(kqVar.bob())) {
                    if (kqVar2 == null) {
                        return false;
                    }
                    String strRjo = kqVar.rjo();
                    String strRjo2 = kqVar2.rjo();
                    if ((!TextUtils.isEmpty(strRjo2) && !strRjo2.equals(strRjo)) || kq(kqVar.bob(), kqVar2.bob())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.kq.bob.kq> mapKq = kqVar.kq();
                    Map<String, com.bytedance.sdk.component.adexpress.kq.bob.kq> mapKq2 = kqVar2.kq();
                    if (mapKq.isEmpty()) {
                        return !mapKq2.isEmpty();
                    }
                    if (mapKq2.isEmpty()) {
                        return false;
                    }
                    return kq(mapKq, mapKq2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    protected boolean kq(com.bytedance.sdk.component.adexpress.kq.bob.kq.oq oqVar) {
        if (oqVar == null || kq() == null) {
            return false;
        }
        List<Pair<String, String>> listOq = oqVar.oq();
        if (listOq == null || listOq.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listOq.iterator();
        while (it.hasNext()) {
            File file = new File(kq(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public void oq(List<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(kq(), com.bytedance.sdk.component.utils.csi.kq(it.next().kq()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public List<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> kq(com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar, com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.kq.bob.kq> mapKq = kqVar.kq();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (mapKq.size() == 0) {
            if (kqVar2 != null && kqVar2.kq().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.kq.bob.kq> mapKq2 = kqVar2.kq();
                Iterator<String> it = mapKq2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar3 = mapKq2.get(it.next());
                    if (kqVar3 != null) {
                        arrayList.addAll(kqVar3.rhi());
                    }
                }
            }
        } else if (kqVar2 != null && kqVar2.kq().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.kq.bob.kq> mapKq3 = kqVar2.kq();
            for (String str : mapKq.keySet()) {
                com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar4 = mapKq.get(str);
                com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar5 = mapKq3.get(str);
                if (kqVar5 == null && kqVar4 != null) {
                    arrayList2.addAll(kqVar4.rhi());
                } else if (kqVar4 == null && kqVar5 != null) {
                    arrayList.addAll(kqVar5.rhi());
                } else if (kqVar4 != null) {
                    for (com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq c0238kq : kqVar4.rhi()) {
                        if (c0238kq != null && !kqVar5.rhi().contains(c0238kq) && c0238kq.oq() != null && c0238kq.kq() != null) {
                            arrayList2.add(c0238kq);
                        }
                    }
                    for (com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq c0238kq2 : kqVar5.rhi()) {
                        if (c0238kq2 != null && !kqVar4.rhi().contains(c0238kq2)) {
                            arrayList.add(c0238kq2);
                        }
                    }
                }
            }
        } else if (mapKq.size() != 0) {
            Iterator<String> it2 = mapKq.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar6 = mapKq.get(it2.next());
                if (kqVar6 != null) {
                    arrayList2.addAll(kqVar6.rhi());
                }
            }
        }
        if (kq(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static void oq(File file, com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar, String str) {
        if (kqVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (kqVar.rhi() != null) {
            Iterator<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> it = kqVar.rhi().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.csi.kq(it.next().kq())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean kq(List<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> list, List<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> list2) {
        for (com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq c0238kq : list) {
            String strKq = c0238kq.kq();
            String strKq2 = com.bytedance.sdk.component.utils.csi.kq(strKq);
            File file = new File(kq(), strKq2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.rjo.oq.kq kqVarRhi = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().rhi();
            kqVarRhi.oq(strKq);
            kqVarRhi.kq(kq().getAbsolutePath(), strKq2);
            com.bytedance.sdk.component.rjo.oq oqVarKq = kqVarRhi.kq();
            list2.add(c0238kq);
            if (oqVarKq == null || !oqVarKq.rhi() || oqVarKq.csi() == null || !oqVarKq.csi().exists()) {
                bob(list2);
                return false;
            }
        }
        return true;
    }

    public boolean kq(String str) {
        String strKq = com.bytedance.sdk.component.utils.csi.kq(str);
        File file = new File(kq().getAbsoluteFile(), strKq + ".zip");
        com.bytedance.sdk.component.rjo.oq.kq kqVarRhi = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().rhi();
        kqVarRhi.oq(str);
        kqVarRhi.kq(file.getParent(), file.getName());
        com.bytedance.sdk.component.rjo.oq oqVarKq = kqVarRhi.kq();
        if (oqVarKq.rhi() && oqVarKq.csi() != null && oqVarKq.csi().exists()) {
            File fileCsi = oqVarKq.csi();
            try {
                zfx.kq(fileCsi.getAbsolutePath(), file.getParent());
                if (!fileCsi.exists()) {
                    return true;
                }
                fileCsi.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void kq(int i10) {
        if (com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().fou() != null) {
            com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().fou().kq(i10);
        }
    }

    public static void kq(File file, com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar, String str) {
        FileOutputStream fileOutputStream;
        if (kqVar == null) {
            return;
        }
        String strNn = kqVar.nn();
        if (TextUtils.isEmpty(strNn)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file3);
                try {
                    fileOutputStream.write(strNn.getBytes("utf-8"));
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file3.renameTo(file2);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable unused2) {
                fileOutputStream = null;
            }
        } catch (IOException unused3) {
        }
    }

    private static boolean kq(Map<String, com.bytedance.sdk.component.adexpress.kq.bob.kq> map, Map<String, com.bytedance.sdk.component.adexpress.kq.bob.kq> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar = map.get(str);
            if (kqVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar2 = map2.get(str);
            if (kqVar2 == null) {
                return false;
            }
            if (kq(kqVar.bob(), kqVar2.bob())) {
                return true;
            }
        }
        return false;
    }

    public static boolean kq(String str, String str2) {
        String[] strArrSplit = str2.split("\\.");
        String[] strArrSplit2 = str.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int length = strArrSplit[i10].length() - strArrSplit2[i10].length();
            if (length == 0) {
                int iCompareTo = strArrSplit[i10].compareTo(strArrSplit2[i10]);
                if (iCompareTo > 0) {
                    return true;
                }
                if (iCompareTo < 0) {
                    return false;
                }
                if (i10 == iMin - 1) {
                    return strArrSplit.length > strArrSplit2.length;
                }
            } else if (length > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean kq(com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar, String str) {
        if (kqVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(kqVar.bob())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return kq(kqVar.bob(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
