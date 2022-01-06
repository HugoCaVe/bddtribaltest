package com.tribal.pom.runners.jobs;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/jobs/general_job_vacancies.feature",
    glue = {"com.tribal.pom.definitions"},
    snippets = SnippetType.CAMELCASE)
public class GeneralJobVacanciesRunner {}
