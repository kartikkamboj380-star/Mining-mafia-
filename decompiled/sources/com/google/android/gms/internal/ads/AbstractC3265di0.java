package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.di0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3265di0 {
    public static boolean a(EnumC2647Xd enumC2647Xd) {
        int iOrdinal = enumC2647Xd.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final EnumC2647Xd b(Context context, C1721Fh0 c1721Fh0) {
        EnumC2647Xd enumC2647Xd;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new C3796hw0(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (c1721Fh0 != null) {
                    c1721Fh0.e(5017, "No .so");
                } else {
                    c1721Fh0 = null;
                }
                enumC2647Xd = EnumC2647Xd.UNKNOWN;
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                c(bArr, null, context, c1721Fh0);
                                enumC2647Xd = EnumC2647Xd.UNSUPPORTED;
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s10 = ByteBuffer.wrap(bArr2).getShort();
                                if (s10 == 3) {
                                    enumC2647Xd = EnumC2647Xd.X86;
                                } else if (s10 == 40) {
                                    enumC2647Xd = EnumC2647Xd.ARM7;
                                } else if (s10 == 62) {
                                    enumC2647Xd = EnumC2647Xd.X86_64;
                                } else if (s10 == 183) {
                                    enumC2647Xd = EnumC2647Xd.ARM64;
                                } else if (s10 != 243) {
                                    c(bArr, null, context, c1721Fh0);
                                    enumC2647Xd = EnumC2647Xd.UNSUPPORTED;
                                } else {
                                    enumC2647Xd = EnumC2647Xd.RISCV64;
                                }
                            }
                            fileInputStream.close();
                        } else {
                            fileInputStream.close();
                            enumC2647Xd = EnumC2647Xd.UNSUPPORTED;
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    c(null, e10.toString(), context, c1721Fh0);
                }
            }
        } else {
            if (c1721Fh0 != null) {
                c1721Fh0.e(5017, "No lib/");
            } else {
                c1721Fh0 = null;
            }
            enumC2647Xd = EnumC2647Xd.UNKNOWN;
        }
        if (enumC2647Xd == EnumC2647Xd.UNKNOWN) {
            String strD = d(context, c1721Fh0);
            if (TextUtils.isEmpty(strD)) {
                c(null, "Empty dev arch", context, c1721Fh0);
                enumC2647Xd = EnumC2647Xd.UNSUPPORTED;
            } else if (strD.equalsIgnoreCase("i686") || strD.equalsIgnoreCase("x86")) {
                enumC2647Xd = EnumC2647Xd.X86;
            } else if (strD.equalsIgnoreCase("x86_64")) {
                enumC2647Xd = EnumC2647Xd.X86_64;
            } else if (strD.equalsIgnoreCase("arm64-v8a")) {
                enumC2647Xd = EnumC2647Xd.ARM64;
            } else if (strD.equalsIgnoreCase("armeabi-v7a") || strD.equalsIgnoreCase("armv71")) {
                enumC2647Xd = EnumC2647Xd.ARM7;
            } else if (strD.equalsIgnoreCase("riscv64")) {
                enumC2647Xd = EnumC2647Xd.RISCV64;
            } else {
                c(null, strD, context, c1721Fh0);
                enumC2647Xd = EnumC2647Xd.UNSUPPORTED;
            }
        }
        if (c1721Fh0 != null) {
            c1721Fh0.e(5018, enumC2647Xd.name());
        }
        return enumC2647Xd;
    }

    private static final void c(byte[] bArr, String str, Context context, C1721Fh0 c1721Fh0) {
        if (c1721Fh0 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(EnumC3914it0.OS_ARCH.c());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        c1721Fh0.e(4007, sb.toString());
    }

    private static final String d(Context context, C1721Fh0 c1721Fh0) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strC = EnumC3914it0.OS_ARCH.c();
        if (!TextUtils.isEmpty(strC) && hashSet.contains(strC)) {
            return strC;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e10) {
            if (c1721Fh0 != null) {
                c1721Fh0.c(2024, 0L, e10);
            }
        } catch (NoSuchFieldException e11) {
            if (c1721Fh0 != null) {
                c1721Fh0.c(2024, 0L, e11);
            }
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }
}
