package com.apm.insight.nativecrash;

import com.apm.insight.l.j;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f13111i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f13112j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f13113k = Pattern.compile("^Abort message: (.*)$");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f13114l = Pattern.compile("^Crash message: (.*)$");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f13115m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f13119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f13120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f13121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f13122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, String> f13123h = new HashMap();

    public c(File file) {
        c(j.b(file));
    }

    public final String a() {
        return this.f13122g;
    }

    public final Map<String, String> b() {
        return this.f13123h;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        String str = this.f13120e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f13121f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.f13122g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    public final void a(File file) {
        File fileB = j.b(file);
        if (fileB.exists()) {
            fileB.renameTo(new File(fileB.getAbsoluteFile() + ".old"));
        }
        NativeImpl.a(file);
        c(j.b(file));
    }

    public final void b(File file) {
        c(j.b(file));
    }

    private void c(File file) {
        if (!file.exists() || file.length() == 0) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            int i10 = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null || i10 >= 64) {
                        break;
                    }
                    if (this.f13116a == null && line.startsWith("pid: ")) {
                        Matcher matcher = f13111i.matcher(line);
                        if (matcher.find() && matcher.groupCount() == 4) {
                            this.f13116a = matcher.group(1);
                            this.f13117b = matcher.group(2);
                            this.f13119d = matcher.group(3);
                            this.f13118c = matcher.group(4);
                        }
                    } else if (this.f13120e == null && line.startsWith("signal ")) {
                        Matcher matcher2 = f13112j.matcher(line);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String strReplace = matcher2.group(1).replace(" ", "");
                            String strReplace2 = matcher2.group(2).replace(" ", "");
                            int iIndexOf = strReplace2.indexOf("frompid");
                            if (iIndexOf > 0) {
                                strReplace2 = strReplace2.substring(0, iIndexOf) + ")";
                            }
                            this.f13120e = "Signal " + strReplace + ", Code " + strReplace2 + "\n";
                        }
                    } else if (this.f13121f == null && line.startsWith("Abort ")) {
                        Matcher matcher3 = f13113k.matcher(line);
                        if (matcher3.find() && matcher3.groupCount() == 1) {
                            this.f13121f = "abort message: " + matcher3.group(1) + "\n";
                        }
                    } else if (this.f13121f == null && line.startsWith("Crash ")) {
                        Matcher matcher4 = f13114l.matcher(line);
                        if (matcher4.find() && matcher4.groupCount() == 1) {
                            this.f13121f = "crash message: " + matcher4.group(1) + "\n";
                        }
                    } else if (this.f13122g == null && line.startsWith("backtrace:")) {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line2 = bufferedReader2.readLine();
                            if (line2 == null || !line2.startsWith("    #")) {
                                break;
                            }
                            sb.append(line2.substring(4));
                            sb.append('\n');
                        }
                        i10++;
                        this.f13122g = sb.toString();
                    } else if (this.f13123h.isEmpty() && line.startsWith("build id:")) {
                        while (true) {
                            String line3 = bufferedReader2.readLine();
                            if (line3 == null || !line3.contains("BuildId:")) {
                                break;
                            }
                            Matcher matcher5 = f13115m.matcher(line3);
                            if (matcher5.find()) {
                                String strGroup = matcher5.group(1);
                                String strGroup2 = matcher5.group(2);
                                String strGroup3 = matcher5.group(3);
                                if (strGroup.equals(JsonStorageKeyNames.DATA_KEY)) {
                                    this.f13123h.put(strGroup2, strGroup3);
                                }
                            }
                        }
                    }
                    i10++;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return;
                    } finally {
                        com.apm.insight.a.a((Closeable) bufferedReader);
                    }
                }
            }
            com.apm.insight.a.a((Closeable) bufferedReader2);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
