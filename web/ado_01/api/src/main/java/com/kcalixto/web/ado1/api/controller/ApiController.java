package com.kcalixto.web.ado1.api.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kcalixto.web.ado1.api.entities.AcademicExperience;
import com.kcalixto.web.ado1.api.entities.AcademicLearning;
import com.kcalixto.web.ado1.api.entities.ExperienceTask;
import com.kcalixto.web.ado1.api.entities.Interests;
import com.kcalixto.web.ado1.api.entities.Languages;
import com.kcalixto.web.ado1.api.entities.PersonalProjects;
import com.kcalixto.web.ado1.api.entities.ProfessionalExperience;
import com.kcalixto.web.ado1.api.entities.SocialMedia;
import com.kcalixto.web.ado1.api.entities.UserDTO;

@RestController
@CrossOrigin(origins = "*")
public class ApiController {

    @GetMapping("/user")
    public UserDTO GetUser() {
        SocialMedia[] sm = new SocialMedia[] {
                new SocialMedia(
                        "linkedin",
                        "https://www.linkedin.com/in/kau%C3%A3-chaves-calixto-727494179",
                        "https://cdn-icons-png.flaticon.com/512/174/174857.png"),
                new SocialMedia(
                        "github",
                        "https://www.github.com/kcalixto",
                        "https://cdn-icons-png.flaticon.com/512/25/25231.png"),
                new SocialMedia(
                        "codewars",
                        "https://www.codewars.com/users/kcalixto",
                        "https://cdn.icon-icons.com/icons2/2389/PNG/512/codewars_logo_icon_145389.png")
        };

        ProfessionalExperience[] pe = new ProfessionalExperience[] {
                new ProfessionalExperience(
                        "Red Ventures Brasil",
                        "rv",
                        "Agosto de 2021",
                        "Atualmente",
                        "Desenvolvedor Back-End",
                        new ExperienceTask[] {
                                new ExperienceTask("Go Programming Language", "golang"),
                                new ExperienceTask("Typescript", "typescript"),
                                new ExperienceTask("Amazon Web Services", "aws"),
                                new ExperienceTask("Serverless Framework", "serverless"),
                        })
        };

        AcademicExperience[] ae = new AcademicExperience[] {
                new AcademicExperience("Universidade Senac São Paulo", "Análise e Desenvolvimento de Sistemas",
                        "Fevereiro de 2022", "Agosto de 2024", new AcademicLearning[] {
                                new AcademicLearning(
                                        "1º Semestre",
                                        "Pokemática é um projeto de jogo em Java para estudantes aprenderem matemática! <br/> inteiramente jogável através de CLI (command line interface).",
                                        new String[] {
                                                "Desafios Interativos",
                                                "Trilha de Aprendizado",
                                                "Batalhas em ginásios",
                                                "Menu para Salvar o jogo",
                                                "Certificado de conclusão com token JWT"
                                        },
                                        "https://github.com/tads-pi/poke-matica"),

                                new AcademicLearning(
                                        "2º Semestre",
                                        "Aplicativo simples de gerenciamento de estoque e vendas de uma farmácia. Desenvolvido com Java Swing e MySQL, permitindo controle de estoque, vendas, registros de clientes e fornecedores, além de geração de relatórios e integração com banco de dados.",
                                        new String[] { "Fácil Instalação em qualquer SO", "Banco de dados Relacional",
                                                "Organização de Cargos e controle de acessos", "Design exclusivo" },
                                        "https://github.com/tads-pi/farmacia"),

                                new AcademicLearning(
                                        "3º Semestre",
                                        "Dogtor é um aplicativo mobile dedicado ao cuidado de animais de estimação. Desenvolvido em React Native com JavaScript, oferece recursos como agendamento de consultas veterinárias, histórico médico, lembretes de vacinas, além de localização de clínicas especializadas e etc.",
                                        new String[] {
                                                "Suporte para Android e IOS",
                                                "Integração com DALL-E (IA de geração de imagens)",
                                                "Design Exclusivo"
                                        },
                                        "https://github.com/tads-pi/dogtor-app")
                        })
        };

        PersonalProjects[] pp = new PersonalProjects[] {
                new PersonalProjects(
                        "Wine Emporium",
                        "wine-emporium",
                        "Wine emporium foi um projeto inicialmente desenhado para a aula de 'Usabilidade e Interfaces Humano-Computador' e decidimos aplicá-lo na prática! Esse projeto foi feito com a colaboração de <a href=\"https://github.com/grvslv\" class=\"project-external-link\">Gustavo Rosa</a>!",
                        new HashMap<String, String>() {
                            {
                                put("Back-end", "https://github.com/kcalixto/wine-emporium-api");
                                put("Front-end", "https://github.com/grvslv/WineEmporium-ui");
                            }
                        }),

                new PersonalProjects(
                        "Aws Utils",
                        "aws-utils",
                        "AWS Utils é meu projeto de Infraestrutura como código utilizando o Terraform. É um projeto em andamento e constante evolução.",
                        new HashMap<String, String>() {
                            {
                                put("Repository", "https://github.com/kcalixto/aws-utils");
                            }
                        }),

                new PersonalProjects(
                        "Luna",
                        "luna",
                        "Luna é o meu maior projeto, o objetivo é prover um novo software de organização financeira pessoal!<br />É um projeto em constante andamento, evolução e rafatoração.<br />Não tenho pretenções de expô-lo para o mundo tão cedo, uma vez que algumas das tarefas para o futuro envolvem scrapping de dados bancários, rastreamento e treinamento de machine learning.",
                        new HashMap<String, String>() {
                            {
                                put("Repository", "https://github.com/kcalixto/luna-main-api");
                            }
                        }),
        };

        Interests[] ir = new Interests[] {
                new Interests("Certificação AWS", "aws",
                        "Estou estudando para a certificação AWS Cloud Practitioner e pretendo tirá-la até o final de 2023."),
                new Interests("Swift Programming", "swift",
                        "Estou estudando a linguagem Swift e pretendo desenvolver o front-end da Luna em swift até o final deste ano."),
                new Interests("Deep Learning", "deep-learning",
                        "Há alguns meses venho me aventurando com a teoria por trás de deep learning e pretendo começar a colocar em prática em breve."),
        };

        Languages[] ln = new Languages[] {
                new Languages("Portugês Brasileiro", "Nativo", "Nativo", " Nativo"),
                new Languages("Inglês", "Avançado", "Avançado", "Intermediário"),
        };

        UserDTO user = new UserDTO(
                "Kauã Chaves Calixto",
                "(11)93393-8090",
                "kauacalixtocontato@gmail.com",
                "12/11/2003",
                sm,
                pe,
                ae,
                pp,
                ir,
                ln);

        return user;
    }
}
