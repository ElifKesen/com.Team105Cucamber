package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports-smoke.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false

)
public class Runner {
    /*
    Cucamberda Runner classi bos bir classtir
    Runner classini diger classkardan farkli kilan ve
    testNGdeki xml dosyalari gibi calismasini saglayan
    iki adet notasyon mevcuttur

    @Runwith notasyonu projemiuze cucamber Junit dependency eklememizin sebebidir
    bu sayede runner classlarimiz cucamber ile calisir

    QcucamberOptions ile istedigimiz özellikleri Runner classina ekleyebiliriz.
    Raporlama gibi extra optionlari da ileride ekleyecegiz

    Ancak
    oncelikli görevi features dosyalari ile stepdefinitionsda
    bulunan Java methodlarini iliskilendirmektir

    tags: features clasoru icinde yazilan taglari aratip buldugu tum feature veya senaryolari calistirir

    dryRun: iki degwr alabilir. True secilirse verilen tag ile isaretli feature veya senariodaki
    eksik stepdefinitions lari bulup ilgili methodlari olusturur
    hicbir sekilde testimizi calistirmaz
    eksik adim yoksa testimiz passed olarak isaretler

    false : secilirse, verilen tag ile isaretlenen
                Feature veya Scenario'lari calistirir
     */
}
