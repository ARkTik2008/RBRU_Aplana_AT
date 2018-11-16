package cucumberFeature;

import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        monochrome = true,
        strict = true,
        snippets = SnippetType.CAMELCASE,
        tags = {"@wip"},
        glue = "ru/raiffeisen/at/cucumber/cmsretail/steps")
public class CucumberRunner{

}